// Main application class that provides a console interface for managing expenses.
public class Main {

public static void main(String[] args) {
    Expense expenses = new Expense();
    expenses.addExpense("Comida", "Desayuno", 8.0);
    expenses.addExpense("Comida", "Almuerzo", 12.0);
    expenses.addExpense("Comida", "Merienda", 5.0);
    expenses.addExpense("Comida", "Cena", 18.0);
    expenses.addExpense("Comida", "Postre", 6.0);

    expenses.addExpense("Entretenimiento", "Cine", 20.0);
    expenses.addExpense("Entretenimiento", "Concierto", 30.0);
    expenses.addExpense("Entretenimiento", "Parque de atracciones", 25.0);
    expenses.addExpense("Entretenimiento", "Videojuegos", 15.0);
    expenses.addExpense("Entretenimiento", "Museo", 10.0);

    expenses.displayAllExpenses();

    System.out.println("Frank cuesta");
}

}
