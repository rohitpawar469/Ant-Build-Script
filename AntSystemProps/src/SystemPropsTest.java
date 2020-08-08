import java.util.Properties;

public class SystemPropsTest {

	public static void main(String[] args) {
		Properties props=System.getProperties();
		props.forEach((k,v)->{System.out.println("Key:"+k+"value:"+v);});

	}

}
