package S9_Interfaces_AbstractClasses_InnerClasses.Challenge18_Interfaces;


import java.util.List;

public interface Saveable {
    List<String> write();

    void read(List<String> savedValues);
}
