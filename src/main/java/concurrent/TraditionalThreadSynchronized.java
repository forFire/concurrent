package concurrent;

public class TraditionalThreadSynchronized {
	 public static void main(String[] args) {  
	        final Outputter output = new Outputter();  
	        new Thread() {  
	            public void run() {  
	                output.output("zhangsan");  
	            }  
	        }.start();        
	        new Thread() {  
	            public void run() {  
	                output.output("lisi");  
	            }  
	        }.start();  
	    }  
	}  


	class Outputter {  
	    public void output(String name) {  
	    	synchronized (this) {
		        for(int i = 0; i < name.length(); i++) {  
		            System.out.print(name.charAt(i));  
		             try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}  
		        } 
		        
	    	} 
	  } 
	    
	    
	    
}
