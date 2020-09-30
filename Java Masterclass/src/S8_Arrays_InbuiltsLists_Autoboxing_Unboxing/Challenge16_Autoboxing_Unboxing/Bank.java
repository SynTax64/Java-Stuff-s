package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge16_Autoboxing_Unboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name) {
        if (isBranchExist(name)) {
            System.out.println("This branch already exist");
        } else {
            this.branches.add(new Branch(name));
        }
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean isBranchExist(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
