package com.abst;

interface Vehicle{
	public abstract String getColor();
	public abstract String getEnineType();
	public static final int x=4;
}
abstract public class InterfaceEg implements Vehicle {
 public String getColour()
 {
	 return"Green";
 }
/** public String getEngineType() {
	 return "manual";
 }
 */
}
