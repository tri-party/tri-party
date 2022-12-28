package dgrubjesic.tri_party.user

import dgrubjesic.tri_party.proto.CreateUserResponse
import dgrubjesic.tri_party.user.domain.User
import dgrubjesic.tri_party.user.in.UserMapper
import dgrubjesic.tri_party.user.in.UserRequest
import org.mapstruct.factory.Mappers
import spock.lang.Specification

class UserMapperUnitSpecs extends Specification {

    UserMapper mapper = Mappers.getMapper(UserMapper.class)

    def 'mapper maps rest request to an domain entity'() {
        given: 'request'
            def email = "email"
            def request = UserRequest.builder().email(email).build()
        when: 'mapper maps'
            def result = mapper.map(request)
        then: 'mapping should match'
            result.email == email
    }

    def 'mapper maps domain entity to create user proto request'() {
        given: 'entity'
            def email = "email"
            def user = User.builder().email(email).build()
        when: 'mapper maps'
            def result = mapper.map(user)
        then: 'mapping should match'
            result.email == email
    }

    def 'mapper maps proto response to domain entity'() {
        given: 'entity'
            def email = "email"
            def id = UUID.randomUUID()
            def response = CreateUserResponse.newBuilder().setId(id.toString()).setEmail(email).build()
        when: 'mapper maps'
            def result = mapper.map(response)
        then: 'mapping should match'
            result.email == email
            result.id == id
    }
}
