package aspectj;

public aspect World {

    pointcut tracedCall() : execution(* *(..)) && (within(org.eclipse.team.examples..*)
     || within(org.limepepper.chefclipse..*));

    before() : tracedCall() {
        System.out.println("Entering: " + thisJoinPoint.toShortString());
    }

    /*
     * // the pointcut defines what method calls to intercept
     * // All calls to the MockSubject.doAs(...) method
     * // (wildcards for return and param types)
     * pointcut doingRemoteCalls() :
     * call(* MockSubject.doAs(..));
     * 
     * Object around() : doingRemoteCalls() {
     * long time = System.currentTimeMillis();
     * Object result = proceed();
     * time = System.currentTimeMillis()-time;
     * //find calling method
     * final StackTraceElement stackTrace
     * = Thread.currentThread().getStackTrace()[2];
     * System.out.println(
     * stackTrace.getClassName()+"."
     * +stackTrace.getMethodName()+" took "
     * +time+"ms to execute.");
     * return result;
     * }
     */

}
