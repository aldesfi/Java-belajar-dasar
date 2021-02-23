class Lamda 
{
    interface NestedIntfModule
    {
        void operation1(String Operand1);
    }

    final static String Operand2 = "Hello! ";

    public static void main(String[] args) 
    {
        NestedIntfModule RecordObject1 =
        Operand1 -> System.out.println(Operand2 + Operand1);
        RecordObject1.operation1("Aldes");
    }
    
}
