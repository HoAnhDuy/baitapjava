package OOP;

public class Time {
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public Time nextSecond() {
		Time nextScTime = new Time(hour, minute, second);
		// solution 1
		nextScTime.second++;
		nextScTime.minute += (nextScTime.second >= 60 ? 1 : 0);
		nextScTime.hour += (nextScTime.minute >= 60 ? 1 : 0);
		nextScTime.hour = nextScTime.hour < 24 ? nextScTime.hour : 0;
		nextScTime.minute = nextScTime.minute < 60 ? nextScTime.minute : 0;
		nextScTime.second = nextScTime.second < 60 ? nextScTime.second : 0;

		// solution 2
//		if (second < 59) {
//			nextScTime.second++;
//		} else {
//			nextScTime.second = 0;
//			if (minute < 59) {
//				nextScTime.minute++;
//			} else if (minute >= 59) {
//				if (hour < 23) {
//					nextScTime.hour++;
//				} else {
//					nextScTime.hour = 0;
//				}
//			}
//		}

		// solution 3
//		nextScTime.second++;
//		nextScTime.minute += nextScTime.second / 60;
//		nextScTime.hour += nextScTime.minute / 60;
//		nextScTime.hour = nextScTime.hour % 24;
//		nextScTime.minute = nextScTime.minute % 60;
//		nextScTime.second = nextScTime.second % 60;

		return nextScTime;
	}

	public Time previousSecond() {
		Time ps = new Time(hour, minute, second);
		// solution 1
//		if (second > 0) {
//			ps.second--;
//		} else {
//			ps.second = 59;
//			if (ps.minute > 0) {
//				ps.minute--;
//			} else {
//				ps.minute = 59;
//				if (ps.hour > 0) {
//					ps.hour--;
//				} else {
//					ps.hour = 23;
//				}
//			}
//		}
		
		// solution 2
		ps.second--;
		ps.minute -= (ps.second < 0 ? 1 : 0);
		ps.hour -= (ps.minute < 0 ? 1 : 0);
		ps.second = ps.second < 0 ? 59 : ps.second;
		ps.minute = ps.minute < 0 ? 59 : ps.minute;
		ps.hour = ps.hour < 0 ? 23 : ps.hour;

		return ps;
	}
}
