public class Karabanovich {
    public static void main(String[] args) {
        if ( args.length != 2 ) {
            System.err.println("Invalid number of arguments");
            System.exit(1);
        }
        double x = Double.parseDouble( args[0] );
        if ( x >= 1 || x <= -1 ) {
            System.err.println("Invalid argument: " + x );
            System.exit(1);
        }
        int k = Integer.parseInt( args[1] );
        if ( k <= 1 ) {
            System.err.println("Invalid argument: " + k );
            System.exit(1);
        }
        double Eps = 1 / Math.pow( 10, k + 1 );
        double result = 0;
        double step = 1;
        int n = 1;
        while( Math.abs( step ) >= Eps ) {
            result += step;
            step = -( step  * x *n)/( n + 1 );
            n+=2;
	}
        String fmt = "%." + args[1] + "f\n";
        System.out.printf( fmt, result );
        System.out.printf( fmt, 1/Math.sqrt( 1 + x ));
        System.exit(0);
    }
}
