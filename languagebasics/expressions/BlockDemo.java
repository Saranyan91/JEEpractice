package languagebasics.expressions;

class BlockDemo {
    public static void main(String[] args) {
        boolean condition = true;
        if(condition){ //begin block 1
            System.out.println("Condition is true");
        } //end block one
        else{ //begin block 2
            System.out.println("Condition is False");
        } //end block 2
    }
}