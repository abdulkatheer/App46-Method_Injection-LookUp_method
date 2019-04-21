package org.katheer.test;

import org.katheer.bean.Account;
import org.katheer.factory.AccountFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Method injection:
        -----------------
        Giving implementation for an interface or abstract class by
        implementing its methods. The method should return a bean object.
        Spring CGILIB is creating implementation classes at runtime.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "org/katheer/resource/applicationContext.xml");

        AccountFactory savingsAccountFactory = (AccountFactory) context.getBean(
                "savingsAccountFactory");

        AccountFactory currentAccountFactory = (AccountFactory) context.getBean(
                "currentAccountFactory");

        Account savingsAccount = savingsAccountFactory.getAccount();
        Account currentAccount = currentAccountFactory.getAccount();

        savingsAccount.showAccInfo();
        savingsAccount.showAccType();
        savingsAccount.getBalance();

        currentAccount.showAccInfo();
        currentAccount.showAccType();
        currentAccount.getBalance();


        System.out.println("\nRuntime Implemented Classes : ");
        System.out.println(savingsAccountFactory.getClass());
        System.out.println(currentAccountFactory.getClass());
    }
}
