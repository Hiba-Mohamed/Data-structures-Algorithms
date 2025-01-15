// Instructions
// Simulate a movie theater that helps users to book and reserve seats.
// reserve seats (if seat is taken, let them know it is taken and suggest an available seat)
// cancel seats
// retrieve initial seating charting

public class MovieTheatreImplmentation {

    public static class TwoDimensionalArrayTheatreSeats {

        String seatsArray[][] = null;

        public TwoDimensionalArrayTheatreSeats(int numberOfRows, int numberOfCols) {
            seatsArray = new String [numberOfRows][numberOfCols];
            for (int row = 0; row < seatsArray.length; row++) {
                for (int col = 0; col < seatsArray[0].length; col++) {
                    seatsArray[row][col] = "AVAILABLE";
                }
            }
        }

        public void bookSeat(int row, int col){
            try {
                if (seatsArray[row][col].equals("AVAILABLE"))  {
                    seatsArray[row][col] = "BOOKED";
                    System.out.println("Seat number "+row+","+col+" Successfully Booked For You!");
                }
                else{
                    System.out.println("Sorry, Seat number "+row+","+col+" Has already been booked");
                    System.out.println("Here is the avilable seats to book");
                    for (int seatsRow = 0; seatsRow < seatsArray.length; seatsRow++) {
                            for (int seatCol = 0; seatCol < seatsArray[seatsRow].length; seatCol++) {
                                if (seatsArray[seatsRow][seatCol].equals("AVAILABLE")){
                                    System.out.println("Seat number: "+seatsRow+","+seatCol);
                                }
                            }
                        }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid seat number, please enter a valid seat number");

            }
        }

        // cancel seats
        public void cancelBooking(int row, int col){
            try {
                if (seatsArray[row][col].equals("BOOKED"))  {
                    seatsArray[row][col] = "AVAILABLE";
                    System.out.println("Seat number "+row+","+col+" Booking Cancelled Successfully!");
                }
                else{
                    System.out.println("Sorry, Seat number "+row+","+col+" Has NOT been booked yet, cancellation failed!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid seat number, please enter a valid seat number");

            }        
        }

        // show user the seating chart 
        public void showSeatingChart() {
            System.out.println("Theatre Seats:  ");
            try {
                for (int row = 0; row < seatsArray.length; row++) {
                    for (int col = 0; col < seatsArray[0].length; col++) {
                        System.out.print("Seat number: " +row+","+col+ " " +seatsArray[row][col] + " ");
                    System.out.println();

                    }
                }
            } catch (Exception e) {
                System.out.println("Array no longer exists");
            }
        }

    }

    public static void main(String[] args) {
        TwoDimensionalArrayTheatreSeats twoDimensionalTheatreSeats = new TwoDimensionalArrayTheatreSeats(4, 4);
        System.out.println(" ");
        twoDimensionalTheatreSeats.showSeatingChart();
        System.out.println(" ");
        twoDimensionalTheatreSeats.bookSeat(1,1);
        System.out.println(" ");
        twoDimensionalTheatreSeats.bookSeat(2,2);
        System.out.println(" ");
        twoDimensionalTheatreSeats.bookSeat(2,2);
        System.out.println(" ");
        twoDimensionalTheatreSeats.bookSeat(3,3);
        System.out.println(" ");
        twoDimensionalTheatreSeats.showSeatingChart();
        System.out.println(" ");
        twoDimensionalTheatreSeats.cancelBooking(3, 3);
        System.out.println(" ");
        twoDimensionalTheatreSeats.cancelBooking(3, 3);
        System.out.println(" ");
        twoDimensionalTheatreSeats.showSeatingChart();
        System.out.println(" ");
    }
}

