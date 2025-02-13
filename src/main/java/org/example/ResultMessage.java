package org.example;

public class ResultMessage {

    private String addResult = "add message success!!";
    private String deleteResult = "delete message success!!";
    private String notFound = "This ID is not found!!";

    public String toString(String text) {

        if (text.equals("addSuccessResult")) {
            return addResult;
        }else if (text.equals("deleteSuccessResult")) {
            return deleteResult;
        }else {
            return notFound;
        }

    }
}
