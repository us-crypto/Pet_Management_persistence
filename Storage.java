import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import org.json.JSONArray;  
import org.json.JSONObject;  



public class Storage {
    /***
     * convertor and storing function of any kinda text to json with any type of file result
     * @param fileName name of createing file with type 
     * @param outPut file in the folder with json array
     * @throws IOException any issue if it wont be created 
     */
    public void saveToFile(String fileName,List<Pet> outPut) throws IOException{
        String json = new Gson().toJson(outPut);
        File file1=  new File(fileName);
        FileWriter fw= new FileWriter(file1);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(json);
        pw.close();
        
    }
    /**
     * loading a json and returning it as a string 
     * @param fileName adress of given json
     * @return String of json
     * @throws Exception
     */
    public List<Pet> loadFromFile(String fileName) throws Exception {
        String file = "C:\\xampp\\htdocs\\Dev\\repos\\Pet_Management_persistence\\"+ fileName;
        String json = readFileAsString(file);
       List<Pet> animal= new ArrayList<Pet>();
        JSONArray jsonArray = new JSONArray(json);  
        Pet saved = null;
        for (Object object : jsonArray) {
            JSONObject singleObj = (JSONObject)object;
            String name = (String)singleObj.get("name");
            String owner = (String)singleObj.get("owner");
            switch ((String)singleObj.get("type")) {
                case "Goldfish":
                saved= new Goldfish(name,owner,"Goldfish");
                    break;
                case "Cat":
                saved= new Cat(name,owner,"Cat");
                    break;
                case "Rabbit":
                saved= new Rabbit(name,owner,"Rabbit");
                    break;
                case "Guppy":
                saved= new Guppy(name,owner,"Guppy");
                    break;
                default:
                throw new WrongJsonDataException("wrong Json Data was saved");
                    
            }
        animal.add(saved);
        }
       
        return animal; //list;
    }
    /**
     * 
     * @param file location of the chosen file
     * @return String of Json Obj 
     * @throws Exception if the string isnt created by any reason 
     */
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

}


