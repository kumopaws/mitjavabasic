package assignment;

class GravityCalculator {
	public static void main(final String[] arguments) {
		final double gravity = -9.81; // Earth's gravity in m/s^2
		final double initialVelocity = 0.0;
		final double fallingTime = 10.0;
		final double initialPosition = 0.0;
		double finalPosition = 0.0;

		finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;

		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
	}
}
