import java.util.Map;

public class ExpenseManager {
    private Map<String, Expense> expenses;

    public ExpenseManager(Map<String, Expense> expenses) {
        this.expenses = expenses;
    }

    // Método para listar los gastos
    public void listExpenses() {
        for (String category : expenses.keySet()) {
            System.out.println("Categoría: " + category);
            expenses.get(category).displayAllExpenses();
        }
    }

    // Método para resumir los gastos
    public void summarizeExpenses() {
        for (String category : expenses.keySet()) {
            double totalExpense = expenses.get(category).getTotalExpense(category);
            System.out.println("Categoría: " + category + ", Gasto total: " + totalExpense);
        }
    }
}
