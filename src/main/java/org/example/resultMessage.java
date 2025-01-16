package org.example;

public class resultMessage {

    private String addResult = "add message success!!";
    private String deleteResult = "delete message success!!";
    private String notFound = "This ID is not found!!";

    public String toString(String text) {

        if (text == "addSuccessResult") {
            return addResult;
        }else if (text == "deleteSuccessResult") {
            return deleteResult;
        }else {
            return notFound;
        }

    }
}
