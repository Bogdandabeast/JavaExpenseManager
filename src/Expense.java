// This class represents an individual expense with two attributes: the amount spent and the expense category.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Expense {
    private Map<String, List<ExpenseItem>> categories;

    public Expense() {
        // Inicializa un HashMap vacío para almacenar las categorías
        this.categories = new HashMap<>();
    }

    public void addExpense(String category, String expenseName, double amount) {
        /**
         * Agrega un gasto a la categoría especificada.
         * @param category: Nombre de la categoría (String).
         * @param expenseName: Nombre del gasto (String).
         * @param amount: Monto del gasto (double).
         */
        if (!categories.containsKey(category)) {
            // Si la categoría no existe, crea una nueva lista dinámica (ArrayList) para ella
            categories.put(category, new ArrayList<>());
        }
        // Crea un objeto ExpenseItem y agrégalo a la categoría
        categories.get(category).add(new ExpenseItem(expenseName, amount));
    }

    public double getTotalExpense(String category) {
        /**
         * Obtiene el gasto total para la categoría especificada.
         * @param category: Nombre de la categoría (String).
         * @return: Monto total del gasto (double).
         */
        return categories.getOrDefault(category, new ArrayList<>()).stream()
                .mapToDouble(ExpenseItem::getAmount)
                .sum();
    }

    public void displayAllExpenses() {
        /**
         * Muestra la lista de todos los gastos con categoría, nombre y precio.
         */
        for (String category : categories.keySet()) {
            System.out.println("Categoría: " + category);
            for (ExpenseItem item : categories.get(category)) {
                System.out.println("  - Nombre: " + item.getName() + ", Precio: " + item.getAmount());
            }
        }
    }

}

class ExpenseItem {
    private String name;
    private double amount;

    public ExpenseItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
