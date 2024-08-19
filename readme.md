# Speedcubing API (Unofficial)

This is an unofficial Speedcubing API, which means it will not be updated regularly, although I am an official staff member.

## Code Example

```java
SpeedcubingAPI api = new SpeedcubingAPI(uuid, key);
if (!api.hasResponse()) return;
General general = api.getGeneral();
KnockbackFFA knockbackFFA = api.getKnockbackFFA();
System.out.println(general.getName() + " has " + knockbackFFA.getKbffa_kill() + " kills in KnockbackFFA");
