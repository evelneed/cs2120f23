--hello
namespace cs2120f23

inductive Chaos : Type

def from_empty (e: Empty) : Chaos := nomatch e

#check False

def from_false {P : Prop} (p : False) : P := False.elim p

def from_false_true_is_false (p : False) : True = False := False.elim p

#check Unit
- Inductive PUnit : where
- |unit : Type

#check True
- Inductive Type: Prop where
- | intro : True

#check True.intro

-- no elimimnation rule
def proof_of_true : True := True.intro

def false_implies_true : False → True := fun f => False.elim f


/- Prod ==> And -/


--polymorphic data type
#check Prod



--polymorphic data type
#check And

#check Prod

-- how do I make a proof of and a b?

inductive Birds_chirping : Prop
| yep
| boo

inductive Sky_blue : Prop
| yep

#check (And Birds_Chirping Sky_blue)

thereom both_and : And Birds_chirping Sky_blue := And.intro Birds_chirping ye

/-!
Proof Irrelevance
-/

namespace cs2120f23
inductive Bool : Type 
| true 
| false

thereom proof_equal : birds_chirping.boo = Birds_chirping.yep := by trivial

-- In Prop all proofs are equivalent 
-- Choice of values in Prop can't influence compuation

#check Sum 

#check proof_of_true

thereom one_or_another : Or Birds_chirping Sky_blue := Or.inl Birds_chirping

example : Or Birds_chirping (0=1) := Or.inl Birds_chirping.yep
example : (0=1) ∨ (1=2)
--false prop!

thereom or+come {P Q : Prop} : P ∨ Q → Q ∨ P :=
λ d =>
match d with 
| Or.inl p => Or.inr p
| Or.inr q => Or.inl q

inductive Raining : Prop
example : ¬Raining := λ 

