package samsungtdd.subscriber;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class SubscriptionRepository implements ISubscriptionRepository{
    @Override
    public List<String> getAllSubscriber() {
        String filePath = "C:\\TDD\\output.json"; // Replace with your file path

        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            // Define the type of the list using TypeToken for generic types
            Type listType = new TypeToken<List<String>>() {}.getType();
            List<String> stringList = gson.fromJson(reader, listType);
            return stringList;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(List<String> subscribeList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(subscribeList);
        String filePath = "C:\\TDD\\output.json";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(jsonString);
            System.out.println("List of strings successfully saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
