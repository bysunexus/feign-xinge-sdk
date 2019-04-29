package in.fireye.xinge.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Environment {

  product(0, "product"),
  dev(1, "dev"),
  ;
  private static Map<String, Environment> NAMES = Stream.of(Environment.values())
    .collect(Collectors.toMap(Environment::getName,t->t));
  private int type;
  private String name;


  Environment(int type, String name) {
    this.type = type;
    this.name = name;
  }

  public static Environment fromName(String name) {
    Environment env = NAMES.get(name);
    if (null == env) {
      env = dev;
    }
    return env;
  }

  public int getType() {
    return type;
  }

  @JsonValue
  public String getName() {
    return name;
  }
}



