public class Accouting {
    public int calculateAfterTaxSalary(Employee worker) {
        int tax = (int) (worker.getBaseSalary() * 0.25); //calculate in otherway
        return worker.getBaseSalary() - tax;
    }
}
