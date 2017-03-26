package facade;

/**
 * Created by Chan on 2017/3/26.
 */
public class Computer {
    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer(){
        cpu=new CPU();
        disk=new Disk();
        memory=new Memory();
    }

    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start the computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
