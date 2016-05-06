class BootStrap {

    def init = { servletContext ->
        log.warn "DAC: Hibernate version is: ${org.hibernate.Version.getVersionString()}"
    }
    def destroy = {
    }
}
