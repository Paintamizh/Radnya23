package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ActitimeGeneric {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/Commondata.Property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	
	
	
	

}
