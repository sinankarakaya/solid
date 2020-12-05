package manager;

import exceptions.FraudDetectedException;

class ThirdPartyFraudChecker implements IFraudChecker {
    // members omitted
    
    @Override
    public void runChecks() throws FraudDetectedException {
        // external system call omitted
    }
  }
