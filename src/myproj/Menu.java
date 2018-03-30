package myproj;
import java.io.File;
import java.util.HashMap;

public class Menu {
    /**Menu with <food name, food info>*/
    //private HashMap<String, File> menu;

    /** The direction of menu folder. */
    private String MenuDir;

    Menu(String dirName){
        MenuDir = dirName;
        //menu = new HashMap<String, File>();
    }

    public void put(String food, String foodInfo) {
        File foodFile = new File(MenuDir + "/" + food);
        Utils.writeContent(foodFile, foodInfo.getBytes());
    }

    public boolean contains(String food) {
        File foodFile = new File(MenuDir + "/" + food);
        return foodFile.isFile();
    }

    public String get(String food) {
        if (!contains(MenuDir + "/" + food)) {
            return "Doesn't have this food in menu";
        }
        File foodFile = new File(MenuDir + "/" + food);
        byte[] bytearr = Utils.readContent(foodFile);
        return new String(bytearr);
    }
}
