class copyArray {

    public static void main(String[] args) {

        int marks[] = { 11, 22, 33, 44, 55 };
        int markscopy[] = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            markscopy[i] = marks[i];
        }

        marks[2] = 100;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < markscopy.length; i++) {
            System.out.println(markscopy[i]);
        }
    }
}