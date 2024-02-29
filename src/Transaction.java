import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Date;

public interface Transaction {
    double getAmount();
    Date getDate();
    String getDescription();
    String getSource();
    String getDestination(); // Додали новий метод для отримання стану транзакції
}

