package S9_Interfaces_AbstractClasses_InnerClasses.Challenge19_AbstractClasses;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}
