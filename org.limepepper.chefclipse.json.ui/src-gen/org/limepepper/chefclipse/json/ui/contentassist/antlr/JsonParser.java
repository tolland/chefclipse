/*
* generated by Xtext
*/
package org.limepepper.chefclipse.json.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.limepepper.chefclipse.json.services.JsonGrammarAccess;

public class JsonParser extends AbstractContentAssistParser {
	
	@Inject
	private JsonGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.limepepper.chefclipse.json.ui.contentassist.antlr.internal.InternalJsonParser createParser() {
		org.limepepper.chefclipse.json.ui.contentassist.antlr.internal.InternalJsonParser result = new org.limepepper.chefclipse.json.ui.contentassist.antlr.internal.InternalJsonParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getBOOLAccess().getAlternatives(), "rule__BOOL__Alternatives");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getModelAccess().getGroup_1_2(), "rule__Model__Group_1_2__0");
					put(grammarAccess.getJsonObjectAccess().getGroup(), "rule__JsonObject__Group__0");
					put(grammarAccess.getJsonObjectAccess().getGroup_2(), "rule__JsonObject__Group_2__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
					put(grammarAccess.getModelAccess().getObjectsAssignment_0(), "rule__Model__ObjectsAssignment_0");
					put(grammarAccess.getModelAccess().getObjectsAssignment_1_1(), "rule__Model__ObjectsAssignment_1_1");
					put(grammarAccess.getModelAccess().getObjectsAssignment_1_2_1(), "rule__Model__ObjectsAssignment_1_2_1");
					put(grammarAccess.getJsonObjectAccess().getPairsAssignment_1(), "rule__JsonObject__PairsAssignment_1");
					put(grammarAccess.getJsonObjectAccess().getPairsAssignment_2_1(), "rule__JsonObject__PairsAssignment_2_1");
					put(grammarAccess.getPairAccess().getStringAssignment_0(), "rule__Pair__StringAssignment_0");
					put(grammarAccess.getPairAccess().getValueAssignment_2(), "rule__Pair__ValueAssignment_2");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
					put(grammarAccess.getJsonObjectValueAccess().getValueAssignment(), "rule__JsonObjectValue__ValueAssignment");
					put(grammarAccess.getArrayValueAccess().getValueAssignment_1(), "rule__ArrayValue__ValueAssignment_1");
					put(grammarAccess.getArrayValueAccess().getValueAssignment_2_1(), "rule__ArrayValue__ValueAssignment_2_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getNullValueAccess().getValueAssignment(), "rule__NullValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.limepepper.chefclipse.json.ui.contentassist.antlr.internal.InternalJsonParser typedParser = (org.limepepper.chefclipse.json.ui.contentassist.antlr.internal.InternalJsonParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JsonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JsonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
