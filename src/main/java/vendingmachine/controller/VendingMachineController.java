package vendingmachine.controller;

import java.util.Scanner;

import vendingmachine.domain.Money;
import vendingmachine.view.InputView;

public class VendingMachineController {
	private final Scanner scanner;

	public VendingMachineController() {
		scanner = new Scanner(System.in);
	}

	public void scanInputMoney() {
		final Money inputMoney = new Money(InputView.scanInputMoney(scanner));
	}
}
