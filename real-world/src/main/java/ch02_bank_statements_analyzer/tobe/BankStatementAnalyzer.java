package ch02_bank_statements_analyzer.tobe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

        String fileName = args[0];
        Path path = Paths.get(RESOURCES + fileName);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementParser.parseLineFromCSV(lines);

        System.out.println("모든 거래 내역의 합: " + calculateTotalAmount(bankTransactions));
        System.out.println("1월 입출금 내역: " + selectInMonth(bankTransactions, Month.JANUARY));
    }

    private static double calculateTotalAmount(List<BankTransaction> bankTransactions) {
        double total = 0d;
        for (BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }

        return total;
    }

    private static List<BankTransaction> selectInMonth(List<BankTransaction> bankTransactions, Month month) {
        List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }
}