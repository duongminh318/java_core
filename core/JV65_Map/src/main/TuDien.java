package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> duLieu= new TreeMap<>();
	
//	them
	public String add(String tuKhoa, String giaTri) {
		return this.duLieu.put(tuKhoa, giaTri);
	}
	
// xoa tu
	public String delete(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	
//	tra tu
	public String Search(String tuKhoa){
		return this.duLieu.get(tuKhoa);
	}
// in ra toan bo tu khoa
	public void printKey() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet(); // lay ra toan bo key bang ham keySet()
		// sau do gan vao set() tapHopTuKhoa
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
		
	
		
	}
	
	public int laySoLuong() {
		return this.duLieu.size();
	}
	
	public void xoaTatCa() {
		this.duLieu.clear();
	}
}
