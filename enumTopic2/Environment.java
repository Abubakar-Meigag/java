package enumTopic2;

enum Env {
      DEVELOPMENT("dev.example.com"),
      STAGING("staging.example.com"),
      PRODUCTION("www.example.com");

      private final String url;

      Env(String url) {
            this.url = url;
      }

      public String getUrl() {
            return url;
      }
}

public class Environment {

      public static void main(String[] args) {

            // Access a specific enum constant
            Env environment = Env.DEVELOPMENT;
            System.out.println("Environment: " + environment);
            System.out.println("URL: " + environment.getUrl());

            Env environment2 = Env.STAGING;
            System.out.println(environment2);
            System.out.println(environment2.getUrl());

            // Direct access
            System.out.println("\nProduction URL: " + Env.PRODUCTION.getUrl());

            // Loop through all environments
            System.out.println("\nAll Environments:");
            for (Env env : Env.values()) {
                  System.out.println(env + " -> " + env.getUrl());
            }

      }

}
