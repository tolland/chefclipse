package org.limepepper.chefclipse.dltk.model;

import java.util.List;

import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.ruby.ast.RubyBlock;
import org.eclipse.dltk.ruby.ast.RubyCallArgument;

public class ChefParser {
	
	public ModelRoot parse(ISourceModule sourceModule) {
		
		ModelRoot sourceFile = new ModelRoot();
		sourceFile.setSourceModule(sourceModule);
		
		IModuleDeclaration parsed = SourceParserUtil.parse(sourceModule, null);
		if (parsed instanceof ModuleDeclaration) {
			ModuleDeclaration moduleDeclaration = (ModuleDeclaration) parsed;
			List statements = moduleDeclaration.getStatements();
			for (Object statement : statements) {
				if (statement instanceof CallExpression) {
					CallExpression callExpression = (CallExpression)statement;
					String name = callExpression.getName();
					if (Resource.RESOURCE_TYPES.contains(name)) {
						Resource resource = parseResource(callExpression);
						sourceFile.getResources().add(resource);
					}
				}
			}
		}

		return sourceFile;
	}
	
	private Resource parseResource(CallExpression callExpression) {
		Resource resource = new Resource();
		resource.setResourceType(callExpression.getName());
		resource.setSourceElement(callExpression);
		CallArgumentsList args = callExpression.getArgs();
		if (args != null) {
			List children = args.getChilds();
			if (children != null && !children.isEmpty()) {
				Object first = children.get(0);
				if (first instanceof RubyCallArgument) {
					RubyCallArgument rubyCallArgument = (RubyCallArgument) first;
					String resourceName = rubyCallArgument.getValue() != null ? rubyCallArgument.getValue().toString() : null;
					resource.setName(resourceName);					
				}
				
				if (children.size() > 1) {
					Object second = children.get(1);
					if (second instanceof RubyBlock) {
						RubyBlock block = (RubyBlock) second;
						// TODO: parse resource actions and attributes if needed
					}
				}
			}
		}
		return resource;
	}
}
