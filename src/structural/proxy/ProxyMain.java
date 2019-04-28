package structural.proxy;

public class ProxyMain {

	public ProxyMain() {
		
		proxy();
	}	
	
	public void proxy() {
		
		Internet intConn = new InternetProxy();
        
        try {
        	
        	intConn.connectTo("niceWorkSite.com");
        	intConn.connectTo("facebook.com");
            
        }catch (Exception e){
            System.out.println(e);
            
        }
		
	}
	
}
