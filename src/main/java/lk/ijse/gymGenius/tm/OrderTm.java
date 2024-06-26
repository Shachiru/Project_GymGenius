package lk.ijse.gymGenius.tm;


import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderTm {

    private String supplement_id;
    private String description;
    private double unitPrice;
    private int qty;
    private double total;
    private JFXButton btnRemove;
}
