package behavioral.chainOfResponsibility;


public interface DispenseLink {

    void setNextLink(DispenseLink nextLink);

    void dispense(Currency cur);
    
}
