public class Main{
    public static void main(String...arg){
        CipherMachine machine = new CipherMachine();


            System.out.println(new String(machine.cipher(machine.toArray("Samuel..."), 3)));
            System.out.println(new String(machine.decipher(machine.toArray("Vdpxho..."), 3)));
    }

}
