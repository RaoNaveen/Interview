package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelBookingPosible {

	public static void main(String[] args) {
		int k = 14;
		List<Integer> arrive = new ArrayList<>(Arrays.asList(36,45,41,7,3,44,40,46,3,16,24,3,8,33));
		List<Integer> depart = new ArrayList<>(Arrays.asList(71,73,85,8,11,62,64,76,25,65,25,30,36,81));
		System.out.println(CallAFunction(arrive,depart,k));
		}

	private static boolean CallAFunction(List<Integer> arrive,
			List<Integer> depart, int k) {
		Collections.sort(arrive);
		Collections.sort(depart);
		int i=0,j=0,roomsRequired=0;
		while(i<arrive.size() && j<depart.size() && roomsRequired<=k) {
			if(arrive.get(i)<depart.get(i)) {
				i++;
				roomsRequired++;
			}else {
				j++;
				roomsRequired--;
			}
		}
		if(roomsRequired<=k)
			return true;
		else
			return false;
	}
}
