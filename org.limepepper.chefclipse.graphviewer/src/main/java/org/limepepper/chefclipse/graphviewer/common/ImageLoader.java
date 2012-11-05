package org.limepepper.chefclipse.graphviewer.common;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

public class ImageLoader {
	
	public static Image Load(String imageName)
	{
		try
		{
			Bundle bundle = Platform.getBundle("org.limepepper.chefclipse.graphviewer"); 
			URL url = bundle.getResource("main/java/image/"+imageName);
			if(url==null)
			{
				url = bundle.getResource("image/"+imageName);
			}
			URL fileURL =FileLocator.toFileURL(url);
			return new Image(Display.getDefault(),
					fileURL.getPath());
		}
		catch (IOException e)
		{
			 throw new RuntimeException(e.getMessage());
		}
        
	}
}
