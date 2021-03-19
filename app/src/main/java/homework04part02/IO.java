package homework04part02;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.*;

/** Reads and writes to json. */
public class IO
{
    public Person[] read(String file)
    {
        Gson gson = new Gson();
        try
        {
            String json = Files.readString(Paths.get("./" + file + ".json"));

            return gson.fromJson(json, Person[].class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // Return null if exception occurred.
        return null;
    }

    /** Writes data to a json file.
     * @param file  Name of file. Do not specify file type, it will always be saved as json.
     * @param data  Data to save to file. */
    public void write(String file, Person[] data)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        try
        {
            FileWriter writer = new FileWriter("./" + file + ".json");
            writer.write(json);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
