import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

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
     */
    public List<Pet> loadFromFile(String fileName) {
        Gson gson = new Gson();
        //List<Pet> a= new ArrayList<Pet>();
        List<Pet> list = new Gson().fromJson(fileName, List.class);
        
        
        return list;
    }


}


