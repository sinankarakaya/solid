package manager;

import exceptions.FraudDetectedException;

interface IFraudChecker {
    void runChecks() throws FraudDetectedException;
}
