package org.example.consumer;

import org.example.lib1.Lib1;
import org.example.lib2.Lib2;

public class Consumer {

	void activate() {
		Lib1.doSomething();
		Lib2.doSomething();
	}
}
