public class SpinnerRunner {
    public static void main(String[] args) {
        Spinner spinner = new Spinner(10);

spinner.spin();  System.out.println(spinner.lastSpin());
System.out.println(spinner.spinCount());
System.out.println(spinner.spinSum());
System.out.println(spinner.averageSpin());

spinner.spin();
System.out.println(spinner.lastSpin());
System.out.println(spinner.spinCount());
System.out.println(spinner.spinSum());
System.out.println(spinner.averageSpin());

spinner.spin();
System.out.println(spinner.lastSpin());
System.out.println(spinner.spinCount());
System.out.println(spinner.spinSum());
System.out.println(spinner.averageSpin());

spinner.spin();
System.out.println(spinner.lastSpin());
System.out.println(spinner.spinCount());
System.out.println(spinner.spinSum());
System.out.println(spinner.averageSpin());

    }
}
