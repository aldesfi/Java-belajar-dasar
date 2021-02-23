class BelajarPolytype 
{

    static Integer InputApa(Integer Operand)
    {
        System.out.println(Operand);
        System.out.println("Kamu Memasukkan Angka");
        return Operand;
    }

    static String InputApa(String Operand)
    {
        System.out.println(Operand);
        System.out.println("Kamu Memasukkan Huruf");
        return Operand;
    }

    public static void main(String[] args)
    {
        InputApa(1);
        InputApa("A");
    }
}
