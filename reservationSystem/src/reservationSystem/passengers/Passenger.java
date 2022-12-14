package reservationSystem.passengers;

public class Passenger {
	
	private Integer seatNo;
	private String pnrNo, name, email, boardingPoint,dropingPoint;
	private int age;
	private String date;
	
	public Passenger(Integer seatNo, String pnrNo, String name, String email, String boardingPoint, String dropingPoint, int age, String date) {
		super();
		this.seatNo = seatNo;
		this.pnrNo = pnrNo;
		this.name = name;
		this.email = email;
		this.boardingPoint = boardingPoint;
		this.dropingPoint = dropingPoint;
		this.age = age;
		this.date = date;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropingPoint() {
		return dropingPoint;
	}

	public void setDropingPoint(String dropingPoint) {
		this.dropingPoint = dropingPoint;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Passenger " + "[" + " Name : " + name + "     Seat No : " + seatNo + "    PNR No : " + pnrNo + "      Email : " + email +"\n" +" \n"
				 + "        Age : " + age + "     Boarding Point : " + boardingPoint + "     Droping Point : " + dropingPoint + "       Date : " + date + "]";
	}
}
