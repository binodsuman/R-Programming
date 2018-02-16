
package pkg;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;



public class Demo {
	
	RConnection connection = null;
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.connectToR();
	}
	
	public void connectToR(){
		
		try{
			connection = new RConnection();
			String vector = "c(1,2,3,4)";
            connection.eval("meanVal=mean(" + vector + ")");
            double mean = connection.eval("meanVal").asDouble();
            System.out.println("The mean of given vector is=" + mean);
            
             /*
             String setwd = "setwd(\"d:/InstalledSoftware/RStudio\")";
             connection.eval(setwd);
             
             vector = "binod<-c(10,20,30,40)";
             connection.eval(vector);*/
            
            int[] input = {10,20,30,40,50};
            connection.assign("input", input);
            REXP output = connection.eval("mean(input)");
            System.out.println("Mean of out input data :"+output);
            System.out.println("Mean of out input data :"+output.asDouble());
            
             
            
		}catch (RserveException e) {
            e.printStackTrace();
        } catch (REXPMismatchException e) {
            e.printStackTrace();
        } catch (REngineException e) {
			e.printStackTrace();
		}finally{
			if(connection != null){
              connection.close();
			}
        }
		
	}

}
