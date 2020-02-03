package edu.sysdesign.designpatterns.mains;

import edu.sysdesign.designpatterns.singleton.SingletonBillPugh;
import edu.sysdesign.designpatterns.singleton.SingletonLazyInitialization;
import edu.sysdesign.designpatterns.singleton.SingletonThreadSafe;
import edu.sysdesign.designpatterns.singleton.SingletonWithDoubleCheckLocking;
import edu.sysdesign.designpatterns.singleton.SingletonWithEagerInitialization;
import edu.sysdesign.designpatterns.singleton.SingletonWithStaticBlock;

public class MainToTestSingeton {

	public static void main(String[] args) {


		////////////////////SingletonWithEagerInitialization (+)////////////////////////

		SingletonWithEagerInitialization instanceSWEIOne = SingletonWithEagerInitialization.getInstance();
		System.out.println("SingletonWithEagerInitialization instanceSWEIOne hashCode: "+instanceSWEIOne.hashCode());

		SingletonWithEagerInitialization instanceSWEITwo = SingletonWithEagerInitialization.getInstance();
		System.out.println("SingletonWithEagerInitialization instanceSWEIOne hashCode: "+instanceSWEITwo.hashCode());

		////////////////////SingletonWithEagerInitialization (-)////////////////////////
		System.out.println();

		////////////////////SingletonWithStaticBlock (+)////////////////////////
		SingletonWithStaticBlock instanceSWSBOne = SingletonWithStaticBlock.getInstance();
		System.out.println("SingletonWithStaticBlock instanceSWSBOne hashCode: "+instanceSWSBOne.hashCode());

		SingletonWithStaticBlock instanceSWSBTwo = SingletonWithStaticBlock.getInstance();
		System.out.println("SingletonWithStaticBlock instanceSWSBTwo hashCode: "+instanceSWSBTwo.hashCode());
		////////////////////SingletonWithStaticBlock (-)////////////////////////
		System.out.println();


		////////////////////SingletonLazyInitialization (+)////////////////////////
		SingletonLazyInitialization instanceSLIOne = SingletonLazyInitialization.getInstance();
		System.out.println("SingletonLazyInitialization instanceSLIOne hashCode: "+instanceSLIOne.hashCode());

		SingletonLazyInitialization instanceSLITwo = SingletonLazyInitialization.getInstance();
		System.out.println("SingletonLazyInitialization instanceSLITwo hashCode: "+instanceSLITwo.hashCode());
		////////////////////SingletonLazyInitialization (-)////////////////////////
		System.out.println();

		////////////////////SingletonThreadSafe (+)////////////////////////
		SingletonThreadSafe instanceSTSOne = SingletonThreadSafe.getInstance();
		System.out.println("SingletonThreadSafe instanceSTSOne hashCode: "+instanceSTSOne.hashCode());

		SingletonThreadSafe instanceSTSTwo = SingletonThreadSafe.getInstance();
		System.out.println("SingletonThreadSafe instanceSTSTwo hashCode: "+instanceSTSTwo.hashCode());
		////////////////////SingletonThreadSafe (-)////////////////////////
		System.out.println();


		////////////////////SingletonWithDoubleCheckLocking (+)////////////////////////
		SingletonWithDoubleCheckLocking instanceSWDCLOne = SingletonWithDoubleCheckLocking.getInstance();
		System.out.println("SingletonWithDoubleCheckLocking instanceSWDCLOne hashCode: "+instanceSWDCLOne.hashCode());

		SingletonWithDoubleCheckLocking instanceSWDCLTwo = SingletonWithDoubleCheckLocking.getInstance();
		System.out.println("SingletonWithDoubleCheckLocking instanceSWDCLTwo hashCode: "+instanceSWDCLTwo.hashCode());
		////////////////////SingletonWithDoubleCheckLocking (-)////////////////////////
		System.out.println();

		
		////////////////////SingletonBillPugh (+)////////////////////////
		SingletonBillPugh instanceSBPOne = SingletonBillPugh.getInstance();
		System.out.println("SingletonBillPugh instanceSBPOne hashCode: "+instanceSBPOne.hashCode());

		SingletonBillPugh instanceSBPTwo = SingletonBillPugh.getInstance();
		System.out.println("SingletonBillPugh instanceSBPOne hashCode: "+instanceSBPOne.hashCode());
		////////////////////SingletonBillPugh (-)////////////////////////
		System.out.println();



	}

}
