import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonListener implements ActionListener {

	private AddBookFrame window = null;
	public AddButtonListener(AddBookFrame window) {
		this.window = window;
	}
	
	private void closeWindow_AddBook() {
		window.dispose();
	}
	public AddButtonListener(BorrowBookDialog borrowBookDialog) {
		
	}
	public AddButtonListener(ReturnBookDialog returnBookDialog) {
		
	}
	public AddButtonListener(ReservationBookDialog reservationBookDialog) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("add")) {
			System.out.println("add");
		}
		
	}

	
	
}
