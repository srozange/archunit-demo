package io.github.archunit;

import static io.github.archunit.ImmutablesTestPredicates.ARE_NOT_GENERATED;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.immutables.value.Value;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "io.github.archunit")
class ImmutablesTest {

	@ArchTest
	static ArchRule model_objects_should_be_annotated_with_immutables_annotation = classes()
			.that().resideInAPackage("..model..")
			.and(ARE_NOT_GENERATED)
			.should().beAnnotatedWith(Value.Immutable.class)
			.because("model objects should be handled by the Immutables library");
}